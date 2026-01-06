package syntax.protected_example.pkg2;

import syntax.protected_example.pkg1.Parent;

public class Pkg2Child {
    public static void main(String[] args) {
        Parent p = new Parent();
        // 只能使用publicName
        System.out.println(p.publicName);
    }
}
