(ns exercise4)

(defn summary
  "Calculates sum of list of numbers."
  [x]
  (reduce + 0 x)
)