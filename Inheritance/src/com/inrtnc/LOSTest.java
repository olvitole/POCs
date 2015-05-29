package com.inrtnc;

public class LOSTest {

	public static void main(String[] args) {

		LOSChild loschild = new LOSChild();
		loschild.setId(2);
		loschild.setName("Prathap");
		loschild.setLevel(99);

		System.out.println("Before converting the Child is: " + loschild);
		LOSParent p = convertToparent(loschild); //child can become parent but only in the context .i.e . Child will get its properties once Upcasting is taken off

		System.out.println("After converting the Child is: " + p);

		LOSParent parent = new LOSParent();
		parent.setId(1);
		parent.setName("Krishna");

		System.out.println("Before converting the Parent is: " + parent);

		LOSChild loschild2 = convertTochild(parent); // parent cannot become child 

		System.out.println("After converting the Parent is: " + loschild2);

	}

	static LOSParent convertToparent(LOSChild child) {
		LOSParent done = (LOSParent) child;
		return done;
	}

	static LOSChild convertTochild(LOSParent parent) {
		LOSChild done = (LOSChild) parent;
		return done;

	}

}
