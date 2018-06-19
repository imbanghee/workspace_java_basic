package javabasic.io.Encoding;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class EncodingSample1 {

	private static String EUC_KR="euc-kr";
	private static String UTF_8="utf8";
	
	private static String encType;

	public void printSystemProperties(){
		Properties prop = System.getProperties();
		prop.list(System.out);
	}
	
	public void getStringGetByte(String str) throws UnsupportedEncodingException{
		byte[] b = str.getBytes(encType);
	}
	
	public void printByteArrayToString(String str) throws UnsupportedEncodingException{
		byte[] b = str.getBytes();
		getStringGetByte(str);
		
		String encStr = new String(b, encType);
		System.out.println(System.getProperty("file.encoding")+"->"+encType);
		System.out.println(encStr);
	}
	
	public void printByteArrayToDigit(String str){
		byte[] b = str.getBytes();
		int i=1;
		for(byte oneByte: b){
			System.out.print(oneByte);
			System.out.print(":");
			System.out.print((char)oneByte);
			if(b.length != i++){
				System.out.print(",");
			}
		}
		System.out.println();
	}
	
	public void setCharacterEncoding(String encType){
		this.encType = encType;
	}
	
	public static void main(String[] args) throws Exception {
		String a = "가나다라abc";
		EncodingSample1 sample1 = new EncodingSample1();
		sample1.setCharacterEncoding(EUC_KR);
		sample1.printByteArrayToDigit(a);
		sample1.printByteArrayToString(a);
		
		sample1.setCharacterEncoding(UTF_8);
		sample1.printByteArrayToDigit(a);
		sample1.printByteArrayToString(a);
		
	}

}
