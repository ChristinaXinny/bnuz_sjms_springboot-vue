package lxy_.interpreter.my_interpreter;
/*
 * client.main�������ľ��ǳ���������Щ���󣬶��������ɳ����е�����
 * ���ã�A=true;B=false;C=false;D=true;����ʽ��ֵ�� true ��  A �� B �� C �� ��D
 * �˴��裺
 * 1.ϵͳ��ʲô����ν���������
 * 2.
 */
public class Client {

	public static void main(String[] args) {
		// ���ã�A=true;B=false;C=false;D=true;����ʽ��ֵ�� true ��  A �� B �� C �� ��D
		
		//Ҷ�ڵ�
        IExpress constant = new Constant(true);
        Varient varienta = new Varient("A");
        Varient varientb = new Varient("B");
        Varient varientc = new Varient("C");
        Varient varientd = new Varient("D");
        //ʵ�������Ļ�������Context��Ա������й�����һ��ְ��--��һְ��
        Context context = new Context();
        //�Ա������и�ֵ
        context.assign(varienta,true);
        context.assign(varientb,false);
        context.assign(varientc,false);
        context.assign(varientd,true);
        //������ı����볣����������ǵı��ʽ�أ�
        //���ڵ�
        //1.   true ��  A
        IExpress andExpr = new AndExpr(constant,varienta);
        //2.    B ��  C
        IExpress andExpr1 = new AndExpr(varientb,varientc);
        //3.  1 �� 2
        IExpress orExpr = new OrExpr(andExpr,andExpr1);
        //4.��D
        IExpress notExpr = new NotExpr(varientd);
        //5. 3 �� 4
        IExpress orExpr1 = new OrExpr(orExpr,notExpr);
        
        boolean exprValue = orExpr1.interpret(context);
        
        System.out.println(exprValue);
        
        
        
	}

}
