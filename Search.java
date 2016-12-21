package array.problems;

public class Search {
	
	/**
	 * @author    mahesh.gaonkar
	 * @since     21-12-2016
	 * @param     nums: The integer array.
	 * @param     target: Target to find.
	 * @return    position: The first position of target. Position starts from 0. 
	 * @exception NullPointerException if nums == null
	 * @print     ex.getMessage(), If @exception found
	 */
	public static int binarySearch(final int[] nums,  final int target) {
		 int position = -1;
		try{
			
			if(nums == null){
				throw new NullPointerException();
			}
			
			int start = 0;
	        int end = nums.length - 1;
	         
	        while(start <= end ){
	            int mid = (start + end) / 2;
	            if(nums[mid] == target){
	                position = mid;
	                break;
	            }
	            else if(nums[mid] < target)
	                start = mid + 1;
	            else
	                end = mid - 1;
	        }
	       
	     // Only if the target number is repeat more than one
	        if(position != -1){
	            while(position >= 0 && position < nums.length && nums[position] == nums[position - 1]){
	                position = position - 1;
	            }
	        }
	       // return position;
		}catch(NullPointerException ex){
			System.out.println(ex.getMessage());
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		 return position;
    }
}
