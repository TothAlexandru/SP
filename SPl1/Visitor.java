
public interface Visitor {
public void visitor(Image i);
public void visitor(ImgProxy i);
public void visitor(Paragraph p);
public void visitor(Table t);
}
