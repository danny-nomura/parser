package inter;

import symbols.Type;

public class For extends Stmt {

   Stmt id; Expr expr; Stmt incdecexpr;

   public For() { id = null; expr = null; incdecexpr = null; }

   public void init(Stmt i, Expr x, Stmt s) {
      id = i; expr = x;  incdecexpr = s;
      children.add(id);
      children.add(expr);
      children.add(incdecexpr);
   }

   public String getNodeStr() {
      return "For";
   }
}
