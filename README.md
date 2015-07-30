## ACBiMA: Advanced Chinese Bi-Character Word Morphological Analyzer

This is the Github repository for the data and tool release of the following paper:

Ting-Hao K. Huang, Yun-Nung Chen, Lingpeng Kong. (2015). ACBiMA: Advanced Chinese Bi-Character Word Morphological Analyzer. The 8th SIGHAN Workshop on Chinese Language Processing (SIGHAN 2015), July 30-31, 2015, Beijing, China. 
[[PDF]](http://www.cs.cmu.edu/~yvchen/doc/SIGHAN15_ACBiMA.pdf)

### ACBiMA Corpus 1.0

#### Morphological Types for Compound Word

|Type | char_1 | char_2|
|-----|--------|--------|
|a-head | Modifier | Adjectival_Head|
|n-head | Modifier | Nominal_Head|
|v-head | Modifier | Verbal_Head|
|nsubj | Nominal_Subject | Predicate(Verb)|
|vobj | Predicate(Verb) | Object|
|vprt | Predicate(Verb) | Particle|
|conj | Two characters play coordinate roles in a word.||
|els | Else||

#### Initial Set (~3k words, annotated with difficulty level)

```
/ACBiMA/data/ACBiMA_Corpus_2013_initial_set/ACBiMA_Corpus_1.0.tsv
```

#### Whole Set (~11k words, including the Initial Set)

```
/ACBiMA/output/acbima-corpus-1.0.json
```

### ACBiMA Tool

Coming soon!

For practical uses, we are porting our code from [Weka](http://www.cs.waikato.ac.nz/ml/weka/) to [Java LibLinear](http://liblinear.bwaldvogel.de/).
The expected release date will be August 2015.

### How to cite?

```
@CONFERENCE {acbima2015,
    author    = "Ting-Hao K. Huang, Yun-Nung Chen, Lingpeng Kong",
    title     = "ACBiMA: Advanced Chinese Bi-Character Word Morphological Analyzer",
    booktitle = "Proc. The 8th SIGHAN Workshop on Chinese Language Processing",
    year      = "2015",
    month     = "jul"
}
```
### License (GNU General Public License)

ACBiMA is free software: you can redistribute it and/or modify 
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

ACBiMA is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with ACBiMA.  If not, see <http://www.gnu.org/licenses/>.
 
### Change Log
 
Date | Updates
------------- | -------------
2015/07/29  | ACBiMA Presented at SIGHAN 2015
 