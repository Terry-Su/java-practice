package syntax.protected_example.pkg1;

public class Parent {
    String name = "";
    protected String parentName = "parentName";
    public String publicName = "";

}

class Child extends Parent {
    public String parentName = "parentName2";

    public static void main(String[] args) {
        Child child = new Child();
        // parentName
        System.out.println(child.parentName);
        child.parentName = "parentName3";
        System.out.println(child.parentName);
    }
}
