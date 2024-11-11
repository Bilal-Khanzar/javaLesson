package SringDersi3;



public class ders3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ==================================================bugun sring methodlari ogrendim =====================================================================================================
		
		// sring methodlari yazacafgiz 
		/*
		 * 1
		 * length() Metodu: length() metodu, bir String nesnesinin karakterlerinin sayısını döndürür.
		 * 
		 *  Bu metot, bir String’in uzunluğunu bulmak için kullanılır. Örneğin:
		 */
		

		/*String str1 = "fvfbgvuipregh[refewjifbfpyecyu8s";
		int uzunluk1 = str1.length();
		System.out.println("String uzunluğu: " + uzunluk1); */
		
		
		
		/*2
		 * equals() Metodu: equals() metodu, iki String nesnesinin içeriklerini
		 *  karşılaştırır ve sonucu boolean olarak döndürür.
		 *  Bu metot, iki String’in eşit olup olmadığını kontrol etmek için kullanılır. Örneğin:
		 */
		
		/*
		String a = "merhaba ";
		String b = "merhaba ";
		boolean esitmi = a.equals(b);
		System.out.println("bu iki str degerleri esit mi " + esitmi);
		
		*/
		
		
		/*3
		 * toUpperCase() ve toLowerCase() Metotları: toUpperCase() metodu, bir
		 *  String nesnesinin tüm karakterlerini büyük harfe dönüştürürken
		 *  , toLowerCase() metodu ise tüm karakterleri küçük harfe dönüştürür. Örneğin:
		 */
		
		/*
		String adin = "muhAMMED";
		String kucuHarf =adin.toLowerCase();
		
		String buyukHarf =adin.toUpperCase();
		
		System.out.println("tum harfleri kucuk harfe cevirdik  " + kucuHarf);
		
		System.out.println("tum harfleri buyuk harfe cevirdik  " + buyukHarf);
		
		*/
		
		
		/*4
		 * substring() Metodu: substring() metodu, bir String nesnesinin belirli bir alt dizisini alır.
		 *  Başlangıç ve bitiş konumları parametre olarak alır ve alt dizeyi döndürür. Örneğin:
		 */
		
		/*
		String dizi = "Merhaba dunya nasilsin !";
		String belirli_dizi = dizi.substring(5,10);
		
		System.out.println("belirtilen dizi   " + belirli_dizi);
		
		*/
		
		/*
		 * 5  STR DE HARDE DEGISTIRME 
		 * replace() Metodu: replace() metodu, bir String nesnesi içindeki belirli karakterleri 
		 * veya karakter dizilerini başka bir karakterle veya karakter dizisiyle değiştirir. 
		 * Örneğin:
		 */
		
		/*
		
		String STR1	 = "java dersi ogreniyorym ";
		String replace1 = STR1.replace("a", "e");
		
		System.out.println(" dizi icindek iharfleri degistirmek   " + replace1);  */
		
		
		/*6
		 *  indexOf() ve lastIndexOf() Metotları: indexOf() metodu, bir String içinde belirli 
		 *  bir karakterin veya karakter dizisinin ilk 
		 *  bulunduğu konumun indisini döndürür.
		 *   lastIndexOf() metodu ise aynı işlemi son bulunduğu konumun indisini döndürür. Örneğin:
		 */
		
		/*
		 * String dizi = "merhaba dunya !";
		 *
			int index_ilk_harfi = dizi.indexOf('a');
			int index_son_harfi = dizi.lastIndexOf("a");
		//int index_ilk_harfi = dizi.indexOf("dunya");// bu methods ta car yerine tum sr verebiliriz 
		System.out.println(index_ilk_harfi);
		
		System.out.println(index_son_harfi);
		*/
		
		/*7
		 * concat() Metodu: concat() metodu, bir String nesnesine başka bir String nesnesini ekler ve birleştirir. Örneğin:
		 */
		
		
		
		/*
		String str1 = "Merhaba  ";
		String str2 = "Dünya";
		String birlesikStr = str1.concat(str2);// iki satiri birlestirmek icin kullanilir 
		System.out.println("Birleşik String: " + birlesikStr);
		
		*/
		
		
		/*
		 * 8
		 * trim() Metodu: trim() metodu, bir String nesnesinin başında 
		 * ve sonunda bulunan boşlukları (whitespace karakterlerini) kaldırır.
		 */
		
		/*String str1 = "  ben okula gidiyorum                                                        ";
		
		String  duzenli = str1.trim();
		System.out.println("duzenli sekli budur yani fazla bslikllari otomatik kaldirirn  " + duzenli);  */
		
		
		/*
		 *  startsWith() ve endsWith() Metotları: startsWith() metodu, bir String’in
		 *   belirli bir karakter veya karakter dizisi ile başlayıp başlamadığını kontrol eder.
		 *   endsWith() metodu ise aynı işlemi sonlandığı karakter veya karakter dizisi ile kontrol eder. Örneğin
		 */
		
		
		
		
		
		
		/*
		 * startsWith() ve endsWith() Metotları: startsWith() metodu, 
		 * bir String’in belirli bir karakter veya karakter dizisi ile başlayıp başlamadığını kontrol eder. 
		 * endsWith() metodu ise aynı işlemi sonlandığı karakter veya karakter dizisi ile kontrol eder. Örneğin:
		 */
	/*	String str = "Merhaba Dünya";
		boolean basladiMi = str.startsWith("M");
		boolean bittiMi = str.endsWith("D");
		System.out.println("Başladı mı? " + basladiMi); // Çıktı: true
		System.out.println("Bitti mi? " + bittiMi); // Çıktı: true
		
		*/
		
		
		
		
		String xS = "mehmet_ erdal ";
		
		System.out.println("e nin degeri "+ xS.charAt('e'));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
