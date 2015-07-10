- Big5全字表.txt
	[說明]	舊電腦中的Big5全字表，不知道是不是完整
	
- rootID.txt
	[說明]	部首 部首ID
	[備註]	有些部首Big5顯示不出來（應該是編碼問題），但仍然是有效的
	
- 字典全二字詞讀音.txt
	[說明]	教育部國語辭典所有二字詞及注音符號
	[備註]	86867行，不重複
	
- CTB5單字詞type.txt
	[說明]	CTB單字詞的詞性ID對照表
	[備註]	34行，不重複，任何"A-B..."形式的POS都只取A

- FeatureFiles\
	存放feature的資料夾，檔案說明如下：

	- noSoundsPOS.txt
		[說明]		教育部國語辭典中每個字下的各種POS下的sense數，依照"名形動副助連代介嘆"順序排列
				如果有一字多音的情況，把所有字音下各POS的sense數直接加起來
		[Format]	(single space隔開) 字 [#sense of 名] [#sense of 形] ...
		[維度]		字+9維
		[行數]		9835
		[備註]		現在的字典已有稍微更新過，sense數可能會不同但幾乎沒差異(以下相同)
	
	- headOrTailNoSoundN.txt (N=2-9)
		[說明]		教育部國語辭典中每個字下的各種POS下的「N個字的例詞」，
				該字分別出現在例詞的「詞首」以及「詞尾」的次數
				依照"名形動副助連代介嘆"順序排列，
				如果有一字多音的情況，把所有字音下各POS的sense數直接加起來
		[Format]	(single space隔開) 
				字 
				[#該字出現在N字例詞詞首的次數 of 名],[#該字出現在N字例詞詞首的次數 of 形], ... ,
				[#該字出現在N字例詞詞尾的次數 of 名],[#該字出現在N字例詞詞尾的次數 of 形] ...
		[維度]		字+9*2維
		[行數]		9610
		[備註]		字典中三字以上例詞的數量太少，暫時先忽略
		
	- tone.txt
		[說明]		音調（4+1聲），binary feature
		[Format]	(single space隔開) 字 輕聲 1聲 2聲 3聲 4聲
		[行數]		9608
		[維度]		字+5維
		
	- root.txt
		[說明]		部首，已經轉成index
		[Format]	(single space隔開) 字 部首ID
		[行數]		9608
		[維度]		字+1維
		
	- htDict.txt
		[說明]		教育部國語辭典中收錄的二字詞，每個字出現在詞首／詞尾的次數
		[Format]	(single space隔開) 字 出現在二字詞詞首的次數 出現在二字詞詞尾的次數
		[行數]		7858
		[維度]		字+2維
		
	- CTB5_1Char.txt
		[說明]		CTB 5.1 單字詞各個POS各有多少詞頻(word count，是用token算)，
				排列順序請見../CTB_typeTable.txt 第一行
		[Format]	(single space隔開) 字 [count of POS1] [count of POS2] ...
		[行數]		2059，而且有些不是字，是怪符號
		[維度]		字+34維
		
	- CTB5_NChar.txt (N=2-8_or_more)
		[說明]		CTB 5.1 該字各出現在(N字詞+POS)的詞首／詞尾幾次
				用 word type 算，不是 token
				排列順序請見../CTB_typeTable.txt
		[Format]	(single space隔開) 字 [head count of POS1] [head count of POS2] ... [tail count of POS1] [tail count of POS2] ...
		[行數]		不一定
		[維度]		不一定


	