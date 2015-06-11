ACBiMA Corpus 1.0: 
The Corpus of 
Advanced Chinese Bi-Character Word Morphological Analyzer (ACBiMA)

@Version: 1.0
@Author: 
@Encoding: UTF-8
@Publish Date: July, 2013
@Size: 3,052 words
@Word Source: Chinese Treebank 5.1
@License: GNU General Public License (v.3)

- Outline

1. Introduction
2. Morphological Types for Compound Word
3. Format
4. Statistics

1. Introduction

We develop a data set for the morphological types of Chinese bi-character 
compound words, referred to as “ACBiMA Corpus 1.0”. We first extract more 
than 3,200 content words from Chinese Treebank 5.1 by POS, and then filter 
out the recognized derived words. After removing some error cases, our 
corpus eventually contains 3,052 words, which are further annotated with 
"morphological types" and "difficulty level of determining" (1, 2, or 3) 
by trained native speakers and examined again by experts. The inter-
annotator agreement test is also applied on a 50-word held-out set, and 
the average Kappa value among all pairs of annota-tors is 0.726.

2. Morphological Types for Compound Word

Type	char_1	char_2
a-head	Modifier	Adjectival_Head
n-head	Modifier	Nominal_Head
v-head	Modifier	Verbal_Head
nsubj	Nominal_Subject	Predicate(Verb)
vobj	Predicate(Verb)	Object
vprt	Predicate(Verb)	Particle
conj	Two characters play coordinate roles in a word.
els	Else

3. Format

ACBiMA Corpus 1.0 is released in the .tsv file format. Each column is 
separated by tab. The descriptions for each field are as follows:

word_ID			Unique ID of word
word			String of word
word_count_in_CTB	Word count in the Chinese Treebank 5.1
difficulty_level	Difficulty level of determining (1 to 3. 1=easy)
type			Gold-standard morphological type

4. Statistics

type	nsubj	v-head	a-head	n-head	vprt	vobj	conj	els
#	38	235	33	1,121	286	435	778	126
%	1.2	7.7	1.1	36.7	9.4	14.3	25.5	4.1
d	1.74	1.55	1.64	1.36	1.38	1.38	1.47	1.95

#: word number
%: word percentage
d: average difficulty level
