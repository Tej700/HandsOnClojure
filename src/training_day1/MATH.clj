(ns training-day1.MATH)

(println (+ 1 2 3)) ;;6
(println (- 5 2 3)) ;;0
(println (* 2 5)) ;;10
(println (/ 10 5)) ;;2
(println (mod 12 5)) ;;2
(println (inc 5)) ;;6
(println (dec 5)) ;;4

(println (Math/abs -10)) ;;10 Absolute value
(println (Math/cbrt 8)) ;;2.0 Cube root
(println (Math/sqrt 4))  ;;2.0 Square root
(println (Math/ceil 4.5)) ;;5.0 Round Up
(println (Math/floor 4.5)) ;;4.0 Round Down
(println (Math/exp 2)) ;;7.38905609893065 e to the power of 2
(println (Math/hypot 2 2)) ;; 2.82.. sqrt(x^2+y^2)
(println (Math/log 2.71828)) ;;0.999 Natural logarithm
(println (Math/log10 100)) ;;2.0 Base 10 long
(println (Math/max 1 5)) ;;5
(println (Math/min 1 5)) ;;1
(println (Math/pow 2 3)) ;;8.0 Power

;;Generate random number
(println (rand-int 20)) ;; random number between 0 to 20

;;perform operation on a  collection
(reduce  + [1 2 3]) ;;6
(reduce  - [1 2 3]) ;;-4
(println (Math/PI)) ;;3.14