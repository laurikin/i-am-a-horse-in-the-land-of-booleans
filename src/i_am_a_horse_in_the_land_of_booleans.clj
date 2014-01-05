(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  ":(")

(defn divisible? [divisor n]
  (zero? (mod n divisor)))

(defn divides? [divisor n]
  (if (zero? (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divisible? 15 n) "gotcha!"
    (divisible? 3 n) "fizz"
    (divisible? 5 n) "buzz"
    :else ""))

(defn teen? [age]
  (< 13 age 20))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'


(boolean nil)

(divides? 2 5)

(teen? 15)


(divisible? 4 2)

(fizzbuzz 70)
