package pracetice11;

public class Main {

	public static void main(String[] args) {

		//TODO④: チーム宇治抹茶の役割を1次元配列で宣言してください。(配列を学ぼう) 
		String[] role = {"役割1", "役割2", "役割3", "役割4", "役割5"};
		
		
		//TODO①: インスタンス化 memberNameの箇所をチームメンバーの名前に変えてね
		HumanInfo memberName1 = new HumanInfo();
		HumanInfo memberName2 = new HumanInfo();
		HumanInfo memberName3 = new HumanInfo();
		HumanInfo memberName4 = new HumanInfo();
		HumanInfo memberName5 = new HumanInfo();
		
		Method method = new Method();
		
		
		//TODO②: 各インスタンスに名前をセットしよう。
		memberName1.setName("佐藤", "克洋");
		memberName2.setName("牛島", "智也");
		memberName3.setName("坂根", "未紗");
		
		//TODO③: 各インスタンスに年齢をセットしよう。(かっちゃん：22歳、みかちゃん：22歳、みちゃ：23歳、こっちゃん：22歳、うっしー：22歳)
		memberName1.setAge(22);
		memberName2.setAge(22);
		memberName3.setAge(23);
		
		//TODO⑤: 各インスタンスにTODO③で作成した配列を使用して役割をセットしよう。
		memberName1.setRole(role[0]);
		memberName2.setRole(role[1]);
		memberName3.setRole(role[2]);
		
		//TODO⑥: Method.javaで各インスタンス情報を全て(名前、年齢、役割)表示するメソッドを呼び出して各インスタンスの情報をコンソール表示してね。
		method.ShowHumanInfo(memberName1);
		method.ShowHumanInfo(memberName2);
		method.ShowHumanInfo(memberName3);
		
		//TODO⑦（こっからは抽象的に指示するから必要な処理を頑張って描いてね）
		// Method.javaに渡した2人の合計点数比較できるようにする。点数が高い方の名前を表示する。
		//（例）インスタンス1：国語30点　と　インスタンス2：国語70点の比較 → 〇〇さんの方が点数が高い
		memberName1.setSubject(100, 200, 30, 40, 50);
		memberName2.setSubject(30, 40, 50, 60, 70);
		memberName3.setSubject(400, 50, 60, 70, 80);
		method.ShowResultScore(memberName1, memberName2);
		
		//TODO⑧ Method.javaにTODO⑦で作ったメソッド名と同じ名前でインスタンス同士の2つの科目合計を比較して、点数が高い方の名前を表示してね。
		//（例）インスタンス1：80点(国語：30点, 英語：50点)　と　インスタンス2：120点(国語：70点, 英語：50点)の比較 → 〇〇さんの方が点数が高い
		method.ShowResultScore(memberName1, memberName2, memberName3);
	}

}

/*
 * ＜各TODOの目的＞
 * TODO①〜⑥でインスタンスの理解を深めよう
 * TODO④、⑤で配列の理解を深めよう
 * TODO⑧でメソッドの引数の理解を深めよう
 * 
 * ＜タスク＞
 * 1. TODOを進める
 * 2. TODO①、②、③、⑤、⑥の作業が終わるたびに各インスタンスを図式化してみよう
 * 図式化 例）https://docs.google.com/spreadsheets/d/1Q31ey-g5n0P9-QjtCYwpSZFehTLj6HU3BqBo8IhdEMQ/edit?usp=sharing
 * 
 * ＜補足＞
 * TODO①〜⑥ではインスタンスに名前とかの情報を与える(人間を作る)
 * TODO⑦〜はインスタンスに各科目のテスト点数を与えて(英語・国語・数学・理科・社会)インスタンスごとの点数の比較をする。
 * 
 * */