package com.cn;

public class Renew {
		public boolean equals(Object obj){
			//�Է���
			if(this==obj)
			{
				return true;
			}
			
			//�ǿ���
			if(obj==null)
			{
				return false;
			}
			
			//�Ƚ�����
			if(this.getClass()!=obj.getClass())
			{
				return false;
			}
			else
				return true;
		}
}