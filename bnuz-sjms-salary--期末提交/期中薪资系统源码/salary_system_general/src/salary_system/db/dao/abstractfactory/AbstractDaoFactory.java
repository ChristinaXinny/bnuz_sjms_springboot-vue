package salary_system.db.dao.abstractfactory;


import salary_system.db.dao.idao.IEmployeeDao;

public abstract class AbstractDaoFactory {
    public AbstractDaoFactory() {
		
	}
	
	//���󹤳������������ݷ��ʶ����ʵ��������������ʵ�֣������ʵ����ʵ�֣��̳У���������ط���ʵ��
	public abstract IEmployeeDao getEmployeeDao();  //IEmployeeDao����ɾ�Ĳ�Employee����
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
