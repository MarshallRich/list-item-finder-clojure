(ns list-item-finder-clojure.core
  (:gen-class))

(defn list-item-getter [item-list]
  (let [count (atom 0)]
       (doseq [item item-list]
          (swap! count inc))
       (nth item-list (- @count 6))))   

(defn -main []
  (let [item-list '("1" "2" "3" "4" "5" "6" "7" "8" "9" "10" "11")
        item (list-item-getter item-list)]
      item))
