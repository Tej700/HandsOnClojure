(ns training-day1.Day3
  (:require [clojure.string :as str]))

;;Variables
(def randVar 10)

;;DataTypes
(def aLong 15)
(def aDouble 1.23456)
(def aString "Annyeong")
(def aBool true)

;;Get the data type
(type 1)

;;Check if no value (nil)
(nil? aLong)

;;Check if a value is positive
(pos? aDouble)

;;Check if a number is negative
(neg? aLong)

;;Check if even
(even? aLong)

;;Check if odd
(odd? aLong)

;;Check if number
(number? aDouble)

;;Check if integer
(integer? aDouble)

;;Check if float
(float? aDouble)

;;Check if zero
(zero? aDouble)

;;Formatted Output
(format "This is a string %s" aString)
;;to print spaces %numberd
(format "5 spaces and %10d" aLong)
;;to prefix 0 %04d = 2 0's prefixed
(format "'Leading zeros %04d" aLong)
;;to print upto x number of decimal places, %.numberf
(format "3 decimals %.2f" aDouble)

;;String
(def str1 "Chal jinae?")

;;check if blank
(str/blank? str1)

;;Does contain "Chal"
(str/includes? str1 "Chal")

;;Index of match
(str/index-of str1 "jinae")
(str/last-index-of str1 "Chal")

;;Split string into vector using separator or Regex
(str/split str1 #"")
;;Split string if digits are present in between
(str/split str1 #"\d")

;;Join a collection into 1 string with a separator
(str/join "" ["Awe" "some"]) ;;Awesome
(str/join " to " ["Train"  "Busan"]) ;; Train to Busan
(str/join [aString str1]) ;;AnnyeongChal jinae?
(str/join [aBool aDouble]) ;;true1.23456

;;Replace all regex with a string
;;there is also replace-first
(str/replace "I am Tejal" #"Tejal" "Tae") ;; "I am Tae"
(str/replace str1 #"jinae" "jinaeseoyo?") ;; "Chal jinaeseoyo??"

;;remove whitespace at beginning and end
;;remove newlines with trim-newline
;;remove left whitespace triml and right with trimr
(str/trim str1)

;;Uppercase
(println(str/upper-case str1))

;;Lowercase
(str/lower-case str1)

;;Lists
;;Stores a list of values with multiple data types
(println (list "BTS" 7 true 13.06))

;Get 1st value
(println (first(list 1 2 3)))

;Get rest values
(println (rest(list 1 2 3 4)))

;get defined index
(println(nth(list 1 2 4 5 6 78 8)4)) ;; 6

;add values to the right
(println (list* 1 2 [3 4 236]))

;add 1 value to the left
(println(cons 3(list 1 2)))

;;SETS
;;List of unique values
(println(set '(1 2 1))) ;1 2

;;Get an index number
(println(get(set '(3 4))4)) ; 4

;;Append a value
(println(conj(set '(3 2))1)) ; 1 3 2

;;Is value in set
(println(contains?(set '(3 2))3)) ; true

;;Remove value from set
(println(disj(set '(1 2))1)) ; 2

;;VECTORS
(println( vector 1 "Tej"))

;;Get index
(println(get(vector 3 5 4)1)) ; 5

;;Append element
(println(conj(vector 12 "aa" 1) 7)) ;; [12 aa 1 7]

;; remove 1st element
(println(pop (vector 1 23 45 6))) ;;[1 23 45]

;;return vector from one point to another
(println(subvec(vector 1 2 3 4)2 4)) ;;[3 4] index starts from 0

;;MAPS
;;collection of key value pairs
(println(hash-map "Name" "Tej" "Age" 26))

;;Sorted lists sort  based on keys
(println(sorted-map 3 2 4555 "Tae" 7 "BTS"))

;;Return value mapped to key
(println(get(hash-map "Name" "Tae" 3 "Tej") 3 "Name")) ; Tae

;;get value for the key
(println(find(hash-map "Name" "Tae" "Age" 26)"Age")) ; Age 26

;;Does map contain a key
(println(contains?(hash-map "Name" "Tej" )"Age")) ;; false

;;Get a list of keys
(println (keys(hash-map "Name" "TAe" "Age" 26))) ;; (Age Name)

;;get values
(println(vals(hash-map "Name" "Tej" "Age" 26))) ;; 26 Tej

;;merge maps
(println(merge-with +(hash-map "Name" "Tae")(hash-map "Age" 26)))

