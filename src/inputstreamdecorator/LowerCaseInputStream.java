package inputstreamdecorator;
// 此类就是对输入流类InputStream进行装饰，
// 由于在java的I/O类中，已经存在抽象装饰者类就是FilterInputStream
// 只要写一个继承此装饰者类的类，并重写read方法，就可以实现对输入流进行装饰，增加一些功能
//  BufferedInputStream 就是继承filterInputstream 类，并增加了字符缓存与readline()的功能
// 此类的功能是对输入流的字符，都装化成小写的功能
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		int c = super.read();
		return (c == -1? c:Character.toLowerCase((char)c));
	}

	@Override
	public int read(byte[] b, int offset, int len) throws IOException {
		// TODO Auto-generated method stub
		int result = super.read(b, offset, len);
		for(int i = offset;i<offset+result;i++){
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}

	@Override
	public int read(byte[] b) throws IOException {
		// TODO Auto-generated method stub
		int result = super.read(b);
		for(int i =0;i<result;i++){
			b[i] = (byte)Character.toLowerCase(b[i]);
		}
		return result;
	}
	
}
