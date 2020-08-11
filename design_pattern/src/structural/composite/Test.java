package structural.composite;

public class Test {
	public static void main(String[] args) {
		CatalogComponent linuxCourse=new Course("Linux课程", 11);
		CatalogComponent windowsCourse=new Course("Windows课程", 9);
		CatalogComponent javaCatalog = new CourseCatalog("Java课程目录",2);
		
		CatalogComponent javaCourse1=new Course("Java课程1", 23);
		CatalogComponent javaCourse2=new Course("Java课程2", 23);
		javaCatalog.add(javaCourse1);
		javaCatalog.add(javaCourse2);
		
		CatalogComponent mainCatalog=new CourseCatalog("技术进阶课程",1);
		mainCatalog.add(linuxCourse);
		mainCatalog.add(windowsCourse);
		mainCatalog.add(javaCatalog);
		
		mainCatalog.print();
				

		
	}
}
