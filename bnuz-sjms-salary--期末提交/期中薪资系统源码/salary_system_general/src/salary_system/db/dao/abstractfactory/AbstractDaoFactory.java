package salary_system.db.dao.abstractfactory;


import salary_system.db.dao.idao.IEmployeeDao;

public abstract class AbstractDaoFactory {
    public AbstractDaoFactory() {
		
	}
	
	//抽象工厂定义所有数据访问对象的实例化方法，但不实现，其具体实现由实现（继承）的子类相关方法实现
	public abstract IEmployeeDao getEmployeeDao();  //IEmployeeDao有增删改查Employee方法
	//public abstract IAffiliationDao getAffiliationDao();
	//public abstract ICommissionedClassificationDao getCommissionedClassificationDao();
	//public abstract IDirectDepositAccountDao getDirectDepositAccountDao();
	//public abstract IEmployeeAffiliationDao getEmployeeAffiliationDao();
	//public abstract IHourlyClassificationDao getHourlyClassificationDao();
	//public abstract IPaycheckAddressDao getPaycheckAddressDao();
	//public abstract ISalariedClassificationDao getSalariedClassificationDao();
	//public abstract ISalesReceiptDao getSalesReceiptDao();
	//public abstract IServiceChargeDao getServiceChargeDao();
	//public abstract ITimeCardDao getTimeCardDao();
	
}
