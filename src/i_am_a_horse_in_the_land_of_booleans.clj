(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

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
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(or false true)

(not-teen? 16)

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))



(defn leap-year? [year]
  (cond
   (and (divisible? 4 year) (not (divisible? 100 year))) true
   (and (divisible? 4 year) (divisible? 100 year) (divisible? 400 year)) true
   :else false))

(leap-year? 404)


; '_______'


(boolean nil)

(divides? 2 5)

(teen? 15)


(divisible? 4 2)

(fizzbuzz 70)
