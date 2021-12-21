package hello;
import org.jruby.Ruby;
import org.jruby.RubyRuntimeAdapter;
//import org.jruby.RubyFixnum;
//import org.jruby.RubyProc;
import org.jruby.javasupport.JavaEmbedUtils;
//import org.jruby.runtime.Block;
//import org.jruby.runtime.ThreadContext;
import java.util.ArrayList;

public class HelloWorld {
	public static void main(String[] args) {
        System.out.println("Hello, World");
        // Create runtime instance
                Ruby runtime = JavaEmbedUtils.initialize(new ArrayList());

                // Parameters
                //RubyFixnum paramA = new RubyFixnum(runtime, 1);
                //RubyFixnum paramB = new RubyFixnum(runtime, 2);

                // Runtime eval method
                RubyRuntimeAdapter evaler = JavaEmbedUtils.newRuntimeAdapter();
                //RubyProc additionProcFromEval = (RubyProc)evaler.eval(runtime, "Proc.new { |a, b| a + b }");
                evaler.eval(runtime, "puts 'This is RUBY!!!'");
                //printProcResult(runtime, additionProcFromEval, paramA, paramB);

                // Shutdown and terminate instance
                JavaEmbedUtils.terminate(runtime);
        }
/*
        protected static void printProcResult(Ruby runtime, RubyProc proc, RubyFixnum paramA, RubyFixnum paramB) {
                Block block = proc.getBlock();
                ThreadContext threadContext = ThreadContext.newContext(runtime);
                int result = (Integer)block.call(threadContext, paramA, paramB).toJava(new Integer(0).getClass());
                System.out.println("Result = " + result);
        }*/
}

