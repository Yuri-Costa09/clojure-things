
(defn total-value
  [value]
  (let [fee-percentage 0.1
        fee-value (* value fee-percentage)] ;; You can only use the bindings if the rest
    (+ value fee-value)))                   ;; of the code is inside of the keys

(println(total-value 10000)) ;; = 11000
