(ns exercise2)

(defn only-greater-than-five
  "returns a list with elements greater than five."
  [x]
  (filter #(< 5 %) x)
)