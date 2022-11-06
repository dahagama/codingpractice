package macbook;

import java.util.List;

public class DFS {
	
	public static int getBiggestRegion(List<List<Integer>> matrix) {
		int maxRegion=0;
		for(int row=0;row<matrix.size();row++) {
			for(int column=0; column<matrix.get(row).size(); column++){
				if(matrix.get(row).get(column) == 1) {
					int size = getRegionSize(matrix, row, column);
					maxRegion= Math.max(size,maxRegion);
				}
			}
		}
		return maxRegion;
	}

	private static int getRegionSize(List<List<Integer>> matrix, int row, int column) {
		if(row<0 || column<0 || row>=matrix.size() || column>=matrix.get(row).size()) {
			return 0;
		}
		
		if(matrix.get(row).get(column)==0) {
			return 0;
		}
		
		matrix.get(row).set(column, 0);
		int size=1;
		for(int r=row-1; r<=row+1; r++) {
			for(int c=column-1; c<=column+1; c++) {
				if(r!=row || c!=column) {
					size+=getRegionSize(matrix, r, c);
				}
			}
		}
		
		return size;
	}

}
