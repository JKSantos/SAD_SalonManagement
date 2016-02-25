package com.gss.utilities;

import java.util.ArrayList;
import java.util.List;

import com.gss.model.Job;

public class JobQualificationHelper {
	
	public List<String[]> checkChanges(List<Job> newList, List<Job> oldList){
		
		List<String[]> finalList = new ArrayList<String[]>();
		
		System.out.println("Added jobs: " + newList.size());
		System.out.println("Old jobs: " + oldList.size());
		
		for(int intOuter = 0; intOuter < newList.size(); intOuter++){
			
			Job newJob = newList.get(intOuter);
			
			if(oldList.size() > 0){
				for(int intInner = 0; intInner < oldList.size(); intInner++){
					if(newJob.getStrJobDesc().equals(oldList.get(intInner).getStrJobDesc()) && newJob.getIntJobStatus() == oldList.get(intInner).getIntJobStatus()){
				
						String[] finalJob = {"same", newJob.getStrJobDesc(), String.valueOf(newJob.getIntJobStatus())};
						finalList.add(finalJob);
						break;
					
					}
					else if(newJob.getStrJobDesc().equals(oldList.get(intInner).getStrJobDesc()) && newJob.getIntJobStatus() != oldList.get(intInner).getIntJobStatus()){
						
						String[] finalJob = {"update", newJob.getStrJobDesc(), String.valueOf(newJob.getIntJobStatus())};
						finalList.add(finalJob);
						break;
						
					}
					else if(intInner == (oldList.size() - 1)){
						String[] finalJob = {"new", newJob.getStrJobDesc(), String.valueOf(newJob.getIntJobStatus())};
						finalList.add(finalJob);
					}
				}
			}
			else{
				for(int intInner = 0; intInner < newList.size(); intInner++){
					Job newJob2 = newList.get(intInner);
					String[] finalJob = {"new", newJob2.getStrJobDesc(), String.valueOf(newJob2.getIntJobStatus())};
					finalList.add(finalJob);
					
				}
				
				return finalList;
			}
		}

		return finalList;
		
	}

}
