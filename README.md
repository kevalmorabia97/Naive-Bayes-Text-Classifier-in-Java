# Naive Bayes Classifier in Java

Naive Bayes methods are a set of supervised learning algorithms based on applying Bayes’ theorem with the “naive” assumption of independence between every pair of features. Naive Bayes learners and classifiers can be extremely fast compared to more sophisticated methods. In spite of their apparently over-simplified assumptions, naive Bayes classifiers have worked quite well in many real-world situations, famously document classification and spam filtering.
<br>Sentiment Analysis is the process of determining whether a piece of writing is positive, negative or neutral. It’s also known as opinion mining, deriving the opinion or attitude of a speaker. A common use case for this technology is to discover how people feel about a particular topic.
<br>Your task is to classify whether a given review has a positive or negative tone using naive Bayes classifier.
<br><br>Dataset used from - http://ai.stanford.edu/~amaas/data/sentiment/
<br>Dataset has 12,500 positive and 12,500 negative reviews of movies for training and testing separately

<br>Reference: Chapter6 - Machine Learning by Tom M. Mitchell 
![Image](https://mrcheerful.000webhostapp.com/GitHub/naive-bayes.PNG)

<hr>

- **Steps to find the sentiment of any text:**

The code I wrote only gives the sentiment as positive(1) or negative(0)
<br>You cant know how much pos or neg

To get a sentiment, write each text on a line with first integer as the actual sentiment
(for testing the accuracy but you can keep it anything if you want to predict)
after that each word is of the form: <Index_in_vocab:freq> seperated by space

For example
10 0:2 1:1 3:1 4:1 
Meaning the sentiment is 10 (positive) and contains
<br>_The_ 2 times
<br>_And_ 1 time
<br>_Of_ 1 time
<br>_To_ 1 time
<br>(See Vocab.txt file)
Put this content in test.data file
Again, the value 10 is for test so if you know a sentiment you can verify that the classification should be 1 (pos)

To get the predicted value, you can add a print statement after line 80 in the code and comment out the code from line 81 to 95
which is just for finding the accuracy of prediction on test data
