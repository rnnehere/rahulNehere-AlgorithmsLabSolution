package com.greatlearning.corejava.service;


public class MergeSortImpl {
	public void merge(int arr[],int left,int mid,int right)
	{
		int n1 = mid-left + 1;
		int n2 = right-mid;
		
		int leftarr[] = new int[n1];
		int rightarr[] = new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			leftarr[i] = arr[left+i];
		}
		
		for(int j=0;j<n2;j++)
		{
			rightarr[j] = arr[mid+1+j];
		}
		
		int i = 0;
		int j = 0;
		int k = left;
		
		while(i<n1 && j<n2)
		{
			if(leftarr[i] >= rightarr[j])
			{
				arr[k] = leftarr[i];
				i++;
			}
			else
			{
				arr[k] = rightarr[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			arr[k] = leftarr[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k] = rightarr[j];
			j++;
			k++;
		}
	}
	public void mergeSort(int notes[],int left,int right)
	{
		if(left<right)
		{
			int mid = (left+right)/2;
			mergeSort(notes,left,mid);
			mergeSort(notes,mid+1,right);
			merge(notes,left,mid,right);
		}
		
	}
}
