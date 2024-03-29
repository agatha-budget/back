package open.tresorier.utils

import open.tresorier.exception.TresorierException
import open.tresorier.utils.PropertiesEnum.*
import java.io.File
import java.io.FileInputStream
import java.util.Properties as JavaProperties

class Properties () {

    val properties: JavaProperties

    // initializer block
    init {
        properties = Properties.getPropertiesFromFile("gradle.properties")
        getSystemProperties()
        getDBProperties()
    }

    fun get(name : PropertiesEnum) : String {
        return properties.getProperty(name.name) ?: throw TresorierException("could not find properties : ${name.name}")
    }

    fun getDBProperties() {

        val tresorier_db_url = this.get(TRESORIER_DB_URL)
        val tresorier_db_usr = this.get(TRESORIER_DB_USR)
        val tresorier_db_pwd = this.get(TRESORIER_DB_PWD)

        val integration_db_url = this.get(INTEGRATION_DB_URL)
        val integration_db_usr = this.get(INTEGRATION_DB_USR)
        val integration_db_pwd = this.get(INTEGRATION_DB_PWD)

        properties.setProperty("TRESORIER_DB_URL", tresorier_db_url)
        properties.setProperty("TRESORIER_DB_USR", tresorier_db_usr)
        properties.setProperty("TRESORIER_DB_PWD", tresorier_db_pwd)

        properties.setProperty("INTEGRATION_DB_URL", integration_db_url)
        properties.setProperty("INTEGRATION_DB_USR", integration_db_usr)
        properties.setProperty("INTEGRATION_DB_PWD", integration_db_pwd)
    }

    fun getSystemProperties() {
        for (propertyEnum in PropertiesEnum.values()){
            val propertyName = propertyEnum.toString()
            System.getenv(propertyName)?.let {
                properties.setProperty(propertyName, it)
            }
        }
    }

    companion object {
        fun set(name : PropertiesEnum, value : String) {
            return Properties.setPropertyInFile("gradle.properties", name.name, value)
        }

        fun getPropertiesFromFile(fileRelativePath : String) : JavaProperties {
            val properties = JavaProperties()
            val path = System.getProperty("user.dir") + "/" + fileRelativePath;
            val inputStream = FileInputStream(path)
            properties.load(inputStream)
            return properties
        }
    
        fun setPropertyInFile(fileRelativePath : String, key : String, value : String) {
            val path = System.getProperty("user.dir") + "/" + fileRelativePath;
            val file = File(path) 
            val content = file.readText().replace(Regex("${key}=.*"), "${key}=${value}");
            file.writeText(content);
        }
    }
}
