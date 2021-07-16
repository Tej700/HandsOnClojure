(ns training-day1.Day2)
;;Atoms
;;with atoms you can change a variable's value
(def my-atom (atom 5))
(println @my-atom) ;;5
(swap! my-atom inc) ;; 6
(swap! my-atom (fn [n] (* (+ n n) 2))) ;; (6+6)*2 =24
(reset! my-atom 1) ; value reset from 24 to 1
(println @my-atom) ;1

;;;;;;;

(defn atom-ex
  [x]
  ;;Define the atoms value
  (def my-atom (atom 2))

  ;;Watchers can be attached to atoms and agents
  ;;to run functions when a value changes
  (add-watch my-atom :watcher
             (fn [key atom old-state new-state]
               (println "atomEx change from " old-state " to " new-state)))
  ;;print the value
  (println "1st x" @my-atom)

  ;;change the value
  (reset! my-atom 10)
  (println "2nd x" @my-atom )

  ;;change te value using a function
  (swap! my-atom inc)
  (println "Increment x" @atom-ex)
  )

;;;Agents
;;agents allow you to change values using functions

;;create agent
(def counter (agent 0))

;;send requests a change to its value
;;add value to an agent
(send counter inc)
;;(send counter + 20)

;;@ or deref provides a snapshot of the current state
(println @counter) ;;1
(println "Counter: " @counter)

;;agents can reference any data structure
(def pulp-fiction(agent {}))

(send pulp-fiction assoc :act-one "PROLOGUE")
(println @pulp-fiction)

(send pulp-fiction assoc :act-two "VINCENT VEGA & MARSELLUS WALLACE'S WIFE")
(println @pulp-fiction)
;;;;;;

