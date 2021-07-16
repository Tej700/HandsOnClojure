(ns training-day1.Functions)

(defn say-hello
  "Receives a name and responds with Hello Again name"

  ;; Attributes for the function
  [name]

  ;; Output the text and value
  (println "Hello Again"  name))
(say-hello "tae") ;; Hello Again tae

(defn get-sum
  [x y]

  ;; The output from the last operation is returned
  (+ x y))

(get-sum 2 3) ;;5

;; You can receive an unknown number of parameters
(defn get-sum-more
  ([x y z]
   (+ x y z))

  ([x y]
   (+ x y)))

(get-sum-more 1 2 3) ;;6

;; Receive a variable number of parameters in a list
(defn hello-you
  [name]
  ;; Another way to combine strings
  (str "Hello " name))

(hello-you "James Reid") ;;Hello James Reid

(defn hello-all
  [& names]

  ;; Pass values to hello-you
  (map hello-you names))

(hello-all "Kate" "Leah" "Scott") ;; ("Hello Kate" "Hello Leah" "Hello Scott")
;; DECISION MAKING

;; RELATIONAL OPERATORS
;; = not= < <= > >=
(= 4 5) ;;false
(not= 4 5) ;;true not equal

;; LOGICAL OPERATORS
;; and or not
(and true false) ;;false
(or true false) ;;true
(not true) ;;false

;; IF THEN ELSE

(defn can-vote
  [age]

  ;; If the statement is true execute the 1st, or 2nd if false
  (if (>= age 18)
    (println "You can Vote")
    (println "You can't Vote")))

(can-vote 24) ;; YOU can vote
(can-vote 13) ;;You can't vote

(defn can-do-more
  [age]

  ;; You can perform multiple actions with do
  (if (>= age 18)
    (do (println "You can Drive")
        (println "You can Vote"))
    (println "You can't Vote")))

;; WHEN
;; Is used when you want to do many things if true

(defn when-ex
  [tof]

  (when tof
    (println "1st Thing")
    (println "2nd Thing")))

;; COND
;; Check for multiple conditions
(defn what-grade
  [n]
  (cond
    (< n 5) "Preschool"
    (= n 5) "Kindergarten"
    (and (> n 5) (<= n 18)) (format "Go to Grade %d" (- n 5))
    :else "Go to College"))

;; LOOPING
;; WHILE LOOPS
;; Loop while condition is true

(defn one-to-x
  [x]

  ;; Value that increments
  (def i (atom 1))

  ;; Loop while true
  (while (<= @i x)
    (do
      (println @i)

      ;; Increment value
      (swap! i inc))))

;; DOTIMES LOOP
;; Execute a statement a set number of times

(defn dbl-to-x
  [x]

  ;; i is incremented each time through
  (dotimes [i x]
    (println (* i 2))))
(dbl-to-x 3) ;; 0 2 4

;; LOOP LOOP
;; Loop through values using recur to change a value
;; until a condition is no longer true

(defn triple-to-x
  [x y]

  ;; Set starting value of i
  (loop [i x]

    ;; Cycle while true
    (when (< i y)
      (println (* i 3))

      ;; Increment the value
      (recur (+ i 1)))))


;; DOSEQ LOOP
;; Iterates through a sequence
(defn print-list

  ;; Holds list passed
  [& nums]

  ;; As you cycle through the list store each item in x
  (doseq [x nums]
    (println x)))

;; FILE I/O

(use 'clojure.java.io)

(defn write-to-file
  [file text]

  ;; with-open opens and closes the file
  ;; and then writes a string to a file
  (with-open [wrtr (writer file)]
    (.write wrtr text)))

(defn read-from-file
  [file]

  ;; We can catch a potential file not found error
  ;; with exception handling

  (try
    ;; Read from a file to a single string
    (println (slurp file))

    ;; Catch the error and print it
    (catch Exception e (println "Error : " (.getMessage e)))))

;; Append text to a file
(defn append-to-file
  [file text]

  (with-open [wrtr (writer file :append true)]
    (.write wrtr text)))

;; Read 1 line at a time
(defn read-line-from-file
  [file]

  (with-open [rdr (reader file)]
    (doseq [line (line-seq rdr)]
      (println line))))

;; DESTRUCTURING
;; Binding of values in a data structure to symbols

(defn destruct
  []
  (def vectVals [1 2 3 4])

  ;; Assign values to symbols
  ;; the-rest stores remaining values
  (let [[one two & the-rest] vectVals]
    (println one two the-rest)))

;; STRUCTMAPS
;; Used to define a complex custom type

(defn struct-map-ex
  []

  ;; Define a Struct
  (defstruct Customer :Name :Phone)

  ;; Define a Struct Object
  (def cust1 (struct Customer "Doug" 4125551212))

  ;; You can also assign to specific keys
  (def cust2 (struct-map Customer :Name "Sally" :Phone 5551122))

  (println cust1)

  ;; Access individual fields
  (println (:Name cust2))
  )