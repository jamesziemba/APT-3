public class FileSystem {
	public long findUsed(int[] fileBytes, int blockBytes) {
		long count = 0;
		for(int file : fileBytes){
			if(file != 0){
				if(file % blockBytes == 0){
					count+= file/blockBytes;
				}
				else{
					count += file/blockBytes + 1;
				}
			}
		}
		return count*blockBytes;
	}
}