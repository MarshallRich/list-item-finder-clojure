(ns list-item-finder-clojure.test_core
  (:require [clojure.test :as t]
            [list-item-finder-clojure.core :refer :all]))
(def item-list '(1 2 3 4 5 6 7 8 9 10))

(t/deftest list-item-getter-test
  (t/is (= true (= 5 (list-item-getter item-list)))))