package ch05;

public class _07_ArrayEx {
	public static void main(String[] args) {
		   /*
	     * *** 성적표 ***
	     * ================================
	     * 번호   국어   영어   수학   총점   평균   학점
	     * ================================
	     *  1   100  100  100  300  100  A
	     *  2    90   90   90  270   90  A
	     *  3    70   70   70  210   70  C
	     *  4   70  100  100  300  100  A
	     *  5   60  100  100  300  100  A
	     *  ==============================
	     *  과목합계  390  390  390   
	     *  
	     *  평균 : 소수점 이하 둘째자리
	     *  2찬원배열명 => scores  국,영,수 점수는 주어진 값
	     *  총점(sum),  평균(avg), 학점, 과목합계(korTot, engTot, mathTot)는 직접계산
	     */
	    
		   String[] sub = {"번호","국어","영어","수학","총점","평균","학점"};
		    int[] num = {1,2,3,4,5};
		    int[][] scores = {
			          {100, 100, 50}   
			         , {90, 90, 90}   
			         , {70, 70, 70}   
			         , {70, 100, 90}   
			         , {60, 100, 100}   
			    };
	    
		int[] f = new int[3];
		    
		System.out.println("***** 성적표  *****"); // 제목
		for (int a = 1; a < 30; a++) {
			System.out.print("="); // ==
		}
		System.out.println("");
	 
	    //과목
	    for (String s : sub) {
	    	System.out.print(s);
	    }
	    //===
	    System.out.println("");
	    for (int c = 1; c<30; c++) {
	    	System.out.print("=");  // == 
	    }
	    System.out.println("");
	    for (int i = 0; i<scores.length; i++) {
	    	System.out.print(num[i] + " "); // 번호 
	    		    	
	    	for (int e=0; e<scores[i].length;e++) {
	    		System.out.print(scores[i][e] + " ");
	    		f[e]+=scores[i][e];
	    	}
	    	int sum1 = 0;
	    	for (int e = 0; e<scores[i].length;e++) {
	    		sum1+=scores[i][e];
	    	}
	    	System.out.print(sum1 );
	    	double avg=0;
	    	for (int e=0; e<scores[i].length;e++) {
	    		avg+=scores[i][e];
	    	}
	    	System.out.printf(" " + "%6.2f",avg/3);
	    	System.out.println("");
	    		
	    }
	    
	    
	    
	 
	    	
	    	
	  
	    
	   
	    
	    
	    
	    
	    
	    
	    
			
		
	
	
		}
	}

