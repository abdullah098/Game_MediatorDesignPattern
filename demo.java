package dp_assignment_3;

public class demo {

	public static void main(String[] args) {
		
		
		Dengon_Dragons f = new Dengon_Dragons();
		B_Vikings b_v = new B_Vikings();
		wiizard wi = new wiizard();
		warrior wa = new warrior();
		
		System.out.println("Abdullah iqbal");
		System.out.println("FA17-BSE-030");
		System.out.println("------------------------");
		
		f.add_member(b_v);
		f.add_member(wi);
		f.add_member(wa);
		
		System.out.println("------------------------");
		
		b_v.act(Actions.Swing);
		System.out.println("------------------------");
		wi.act(Actions.Throw);
		System.out.println("------------------------");
		wa.act(Actions.Search); 
		System.out.println("------------------------");

	}

}
