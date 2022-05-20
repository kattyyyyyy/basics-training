package pracetice11;

public class Method {

	public void ShowHumanInfo(HumanInfo humanInfo) {
		System.out.println("名前: " + humanInfo.getName());
		System.out.println("年齢: " + humanInfo.getAge());
		System.out.println("役割: " + humanInfo.getRole());
	}
	
	private String CompareScore(HumanInfo humanInfo1, HumanInfo humanInfo2) {
		int totalScore1 = humanInfo1.getEnScore() + humanInfo1.getjaScore() + humanInfo1.getmathScore() + humanInfo1.getSocialScore() + humanInfo1.getScienceScore();
		int totalScore2 = humanInfo2.getEnScore() + humanInfo2.getjaScore() + humanInfo2.getmathScore() + humanInfo2.getSocialScore() + humanInfo2.getScienceScore();
		if(totalScore1 == totalScore2) {
			return "同点";
		} else if(totalScore1 > totalScore2){
			return humanInfo1.getName();
		} else {
			return humanInfo2.getName();
		}
	}
	
	public void ShowResultScore(HumanInfo humanInfo1, HumanInfo humanInfo2) {
		String result = CompareScore(humanInfo1, humanInfo2);
		if(result.equals("同点")) {
			System.out.println(result);
		} else {
			System.out.println(result + "の方が点数が高いです。");
		}
	}
	
	public void ShowResultScore(HumanInfo humanInfo1, HumanInfo humanInfo2, HumanInfo humanInfo3) {
		String result = CompareScore(humanInfo1, humanInfo2);
		if(humanInfo1.getName().equals(result)) {
			ShowResultScore(humanInfo1, humanInfo3);
		} else {
			ShowResultScore(humanInfo2, humanInfo3);
		}
	}
}
