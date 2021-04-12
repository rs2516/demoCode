package Practice;

import static org.testng.Assert.assertTrue;import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeStream {
	
		
		//@Test
		public void testOne()
		{
			ArrayList<String> name= new ArrayList<String>();
			name.add("Rahul");
			name.add("Rishi");
			name.add("Shalini");
			name.add("Shashi");
			name.add("Ravi");
			name.add("Dhiraj");
			
			int count= 0;
		for(int i=0; i< name.size(); i++)
		{
			name.get(i);
			count++;
		}
		System.out.println(count);
		
		name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		name.stream().filter(s-> s.startsWith("R")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		}
		
		@Test
		public void testTwo()
		{
			ArrayList<String> name= new ArrayList<String>();
			name.add("Rahul");
			name.add("Rishi");
			name.add("Shalini");
			name.add("Shashi");
			name.add("Ravi");
			name.add("Dhiraj");
			
			ArrayList<String> name1= new ArrayList<String>();
			name1.add("Singh");
			name1.add("Sharma");
			name1.add("Verma");
			
			Stream<String> conName= Stream.concat(name.stream(), name1.stream());
			//conName.forEach(s-> System.out.println(s));
			
			boolean flag = conName.anyMatch(s->s.equalsIgnoreCase("Rahul"));
			System.out.println(flag);
			
			Assert.assertTrue(flag);
			
		}
		
		@Test
		public void streamCollect()
		{
			List<String> ls= Stream.of("Buxar", "Arrah", "Patna", "Siwan").sorted().collect(Collectors.toList());
			System.out.println(ls.get(1));
		}
		
		@Test
		public void assiInterger()
		{
			List<Integer> li = new ArrayList<Integer>();
			li.add(2);
			li.add(5);
			li.add(3);
			li.add(2);
			li.add(7);
			li.add(3);
			
			li.stream().sorted().distinct().forEach(s->System.out.println(s));
			
		}

}
