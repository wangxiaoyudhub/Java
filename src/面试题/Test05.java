package ������;

public class Test05{
	
	public static void main(String[] args){
		/**
			���������
			
		*/
		
//		String[] names = {"����ϣ","��������","С������"};
//
//		String[] newNames = new String[names.length*2];
//
//		for(int i = 0;i<names.length;i++){
//			newNames[i] = names[i];
//		}
//
//		names = newNames;
//
//		for(String str : names){
//			System.out.println(str);
//		}

        String[] names = {"q", "w", "e"};
        String[] newNames = new String[names.length * 2];
        for (int i = 0; i < names.length; i++) {
            newNames[i] = names[i];
        }

        names = newNames;

        for (String str : names) {
            System.out.println(str);
        }
	}
}