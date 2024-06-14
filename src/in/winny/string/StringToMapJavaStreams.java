package in.winny.string;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringToMapJavaStreams {
	public static void main(String[] args) {
        String input = "key1=value1,key2=value2,key3=value3";
        
      Arrays.stream(input.split(",")).map(m-> m.split("=")).map(m1-> Map.entry(m1[0], m1[1])).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
         
        

    }
}
