package ro.utcn.Sergiu.Model;

import java.util.Objects;

public class Monomial implements Comparable{
    private float coefficient;
    private int exp;

    public Monomial(float coefficient,int exp) {
        this.coefficient = coefficient;
        this.exp=exp;
    }
    public Monomial(String s)
    {

        if(!s.contains("x"))
        {
            this.exp=0;
            this.coefficient=Float.parseFloat(s);
        }
        else
        {
            if(s.charAt(s.length()-1)=='x')
            {
                if(s.equals("x"))
                {
                    this.exp=1;
                    this.coefficient=1;
                }
                else
                {
                    this.exp=1;

                    if(s.startsWith("-x"))
                    {
                        this.coefficient=-1;
                    }else
                    if(s.startsWith("+x"))
                    {
                        this.coefficient=1;
                    }
                    else
                        this.coefficient=Float.parseFloat(s.substring(0,s.length()-1));
                }


            }
            else
                    if(s.charAt(0)=='x')
                    {

                        this.exp=Integer.parseInt(s.substring(2));
                        this.coefficient=1f;
                    }
                    else
                        if(s.startsWith("-x"))
                        {
                            this.exp=Integer.parseInt(s.substring(3));
                            this.coefficient=-1;
                        }
                        else
                            if(s.startsWith("+x"))
                            {
                                this.exp=Integer.parseInt(s.substring(3));
                                this.coefficient=1;
                            }
                            else{
                                String[] parts=s.split("x\\^");
                                this.coefficient=Float.parseFloat(parts[0]);
                                this.exp=Integer.parseInt(parts[1]);
                            }
        }
    }
    public float getCoefficient() {
        return coefficient;
    }

    public int getExp() {
        return exp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monomial monomial = (Monomial) o;
        return Float.compare(monomial.coefficient, coefficient) == 0 && exp == monomial.exp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coefficient, exp);
    }

    @Override
    public String toString() {
       String res = new String("");
       if(this.coefficient!=0)
       {
           if(this.coefficient>0)
           {
               if(this.exp==0)
                   return "+"+this.coefficient+" ";
               if(this.exp==1)
                   if(this.coefficient==1)
                       return "+x";
                   else
                       return "+"+this.coefficient+"x";
               return "+"+this.coefficient+"x^"+this.exp;
           }
           else
           {
               if(this.exp==0)
                   return ""+this.coefficient+" ";
               if(this.exp==1)
                   if(this.coefficient==-1)
                       return "x";
                   else
                       return ""+this.coefficient+"x";
               return ""+this.coefficient+"x^"+this.exp;
           }

       }
       return res;
    }

    @Override
    public int compareTo(Object o) {
        Monomial m=(Monomial) o;
        if(this.exp>m.exp)
            return -1;
        else
            if(this.exp<m.exp)
                return 1;
            else
                return 0;
    }
}
