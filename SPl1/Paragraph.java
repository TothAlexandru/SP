
public class Paragraph implements Element {
String text;
AlignStrategy a=new AlignRight();
public Paragraph(String text) {
	this.text = text;
}
public void print() {
	a.printAligned(text);
}
public void add(Element e)
{
	
}
public void setAlignStrategy(AlignStrategy align) {
	// TODO Auto-generated method stub
	a=align;
}
public void accept(Visitor v)
{
	
}
}
