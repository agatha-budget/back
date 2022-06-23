package open.tresorier.dependenciesinjection

import open.tresorier.mailing.*
import open.tresorier.mailing.adapter.*
import open.tresorier.dao.*
import open.tresorier.dao.jooq.h2.*
import org.koin.dsl.module


val test_adapter_module = module {
    single<IMailingPort> { MockAdapter() }
    single<IPersonDao> { H2PersonDao(get()) }
    single<IBudgetDao> { H2BudgetDao(get()) }
    single<IAccountDao> { H2AccountDao(get()) }
    single<ICategoryDao> { H2CategoryDao(get()) }
    single<IMasterCategoryDao> { H2MasterCategoryDao(get()) }
    single<IOperationDao> { H2OperationDao(get()) }
    single<IAllocationDao> { H2AllocationDao(get()) }
}
