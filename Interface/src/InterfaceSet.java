interface InterfaceSet {
		public void add(int e);
		public void display();
		public int count();
		public boolean isElemementof(int e);
		public int getElement(int index);
		public Set union(Set s);
		public static final int MAX = 10;
 class Set implements InterfaceSet{
		private int[] set;
		private int count;
			
			public Set() {
				set = new int[MAX];
				count = 0;
			}
			
			public Set(int MAX) {
				set = new int[MAX];
				count = 0;
			}
			
			public void add(int e) {
				int i;
				for (i = 0;count < MAX; i++) {
					if(! isElementof(e))
						set[count++]=e;
					break;
				}
			}
			
			public void display() {
				for(int i = 0; i<count;i++)
					System.out.println(set[i] + " ");
			}
			
			public int count() {
				return count;
			}
			
			public boolean isElementof(int e) {
				// TODO Auto-generated method stub
				boolean found = false;
				for (int i = 0; i < count; i++){
					if(set[i] == e) {
						found = true;
						break;
					}
				}
				return found;
			}
			
			public int getElement(int index) {
				return set[index];
			}
			
			public Set union(Set s) {
				int uniqueCount = this.count++;
				int flag = 0;
				int i;
				int j;
				
				for(i = 0; i < count;i++) {
					flag = 1;
					for(j = 0; j<this.count; j++) {
						if(this.count == s.set[i]) {
							flag = 0;
							break;
						}
					}
					if(flag == 1)
						uniqueCount++;
				}
				
				Set tmp = new Set(uniqueCount);
					for(int k = 0; k < this.count; k++) {
						tmp.set[tmp.count] = this.set[k];
						tmp.count++;
					}
					for(i = 0; i < s.count;i++) {
						flag = 1;			
						for(j = 0; j < this.count; j++) {
						flag = 0;
						break;
						}
					}
					if (flag == 1) {
						tmp.set[tmp.count] = s.set[i];
						tmp.count++;
					}
					return tmp;
			}
			@Override
			public boolean isElemementof(int e) {
				// TODO Auto-generated method stub
				return false;
			}
}
}

