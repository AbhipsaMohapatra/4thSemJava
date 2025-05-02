package functional_Interface;

import ErrorHandling.program1;

public class Q4 {
	interface reportCard{
		public int marksForSubjects(int mathematics,int physics,int biology,int history,int chemistry);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reportCard amtCard =(int mathematics,int physics,int biology,int history,int chemistry)->{
			mathematics+=10;
			return (mathematics+physics+biology+history+chemistry);};
			System.out.println(amtCard.marksForSubjects(74,87,66,53,90));
		}

	}


