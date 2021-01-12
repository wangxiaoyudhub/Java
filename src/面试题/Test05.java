package 面试题;

public class Test05{
	
	public static void main(String[] args){
		/**
			数组的扩容
			
		*/
		
//		String[] names = {"麻生希","爱田奈奈","小峰由衣"};
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