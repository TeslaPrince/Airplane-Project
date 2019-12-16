
public enum States {
	AL(1), AK(2), AZ(3), AR(4), CA(5), CO(6), CT(7), DE(8), DC(9), FL(10), GA(11), HI(12), ID(13), IN(14), IA(15), KS(16), KY(17), LA(18), ME(19), MD(20), MA(21), MI(22), MN(23), MS(24), MO(25), MT(26), NE(27), NV(28), NH(29),NJ(30), NM(31), NY(32), NC(33), ND(34), OH(35), OK(36), OR(37), PA(38),RI(39), SC(40),SD(41),TN(42),TX(43),UT(44),VT(45),VA(46),WV(47),WI(48),WY(49);
	
	private int value;
	
	private States(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}

}
