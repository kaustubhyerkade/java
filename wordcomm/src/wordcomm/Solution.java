package wordcomm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class WordNode{
	String Word;
	int numSteps;

	public WordNode(String word , int numSteps){

		this.Word = word;
		this.numSteps = numSteps;
	}
}
public class Solution {

	public int ladderLength(String beginWord , String endWord, Set<String> wordDict)
	{
		LinkedList<WordNode> queue = new LinkedList<WordNode>();
		queue.add(new WordNode(beginWord, 1));

		wordDict.add(endWord);

		while(!queue.isEmpty())
		{
			WordNode top = queue.remove();
			String word = top.Word;

			if(word.equals(endWord))
			{
				return top.numSteps;
			}

			char[] arr = word.toCharArray();
			for(int i=0; i<arr.length;i++)
			{
				for(char c = 'a';c <= 'z';c++)
				{
					char temp = arr[i];  
					if(arr[i]!=c)
					{  
						arr[i]=c;	
					}
					String newWord = new String(arr);
					if(wordDict.contains(newWord))
					{
						queue.add(new WordNode(newWord,top.numSteps+1));
						wordDict.remove(newWord);
					}
					arr[i]=temp;
				}

			}
		}
		return 0;
	}


}

class Main{
	public static void main(String args[])
	{
	
		Set<String> D = new HashSet<String>();
		D.add("cat");
		D.add("mat");
		D.add("hat");
		D.add("ham");
		D.add("mate");
		D.add("end");
		
		String a= "cat";
		String b= "mate";
		Solution s = new Solution();
		s.ladderLength(a, b, D );
		
		System.out.println();
	}
	
}
