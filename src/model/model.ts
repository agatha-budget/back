import { Operation, Account, Budget, Category, CategoryData as ICategoryData, MasterCategory } from '@/services/api/openApi/api'

interface BudgetData {
    [monthComparable: number]: CategoryDataList;
}

interface AccountList {
    [accountId: string]: Account;
}

interface CategoryList {
    [categoryId: string]: Category;
}

interface MasterCategoryList {
    [masterCategoryId: string]: MasterCategory;
}

interface CategoryDataList {
    [categoryId: string]: CategoryData;
}

interface CategoryByMasterCategoryList {
    [masterCategoryId: string]: string[];
}

interface MasterCategoriesData {
    [masterCategoryId: string]: CategoryData;
}

class CategoryData implements ICategoryData {
    allocated = 0;
    spent = 0;
    available = 0;
}

export {
  Operation, CategoryData, MasterCategoriesData, BudgetData, Account, AccountList,
  CategoryList, Budget, Category, MasterCategory, CategoryDataList, MasterCategoryList,
  CategoryByMasterCategoryList
}
