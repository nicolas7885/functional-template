(ns exercise3)

(defn fibonacci
  "Calculates fibonnacci fo x."
  [x]
  (if (> x 1 )
    (+ 
      (fibonacci (- x 1))
      (fibonacci (- x 2))
    )
    (if (= x 1 ) 
      1
      0
    )
  )
)
    