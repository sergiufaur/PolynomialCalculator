package ro.utcn.Sergiu.Model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polynomial {
    private static final String PATTERN = "([+-]?(?:(?:\\d+x\\^\\d+)|(?:\\d+x)|(?:\\d+)|(?:x\\^\\d+)|(?:x)))";
    private List<Monomial> monomials = new ArrayList<>();

    public Polynomial(List<Monomial> monomials) {
        this.monomials = monomials;
    }
    public Polynomial(String s)
    {
        s=s.replaceAll("\\s","");
        Pattern p = Pattern.compile(PATTERN);
        Matcher m= p.matcher(s);
        while(m.find()){
            monomials.add(new Monomial(m.group()));
        }
    }
    public List<Monomial> getMonomials(){
        return Collections.unmodifiableList(monomials);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polynomial that = (Polynomial) o;
        return Objects.equals(monomials, that.monomials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monomials);
    }

    @Override
    public String toString() {
        String res =new String();
        for (Monomial monomial:this.monomials
             ) {
                    res=res+monomial.toString();
        }
        return res;
    }
}
