(ns yoyocom.core
  (:require [goog.dom :as gdom]
            [om.next :as om :refer-macros [defui]]
            [om.dom :as dom]))

(enable-console-print!)


(defn yoyo-flag []
  (dom/div (clj->js {:style {:width 17 :height 9 :marginRight 5
                             :marginTop -2.2
                             :backgroundColor "#F1959F"}})
           (dom/div (clj->js {:style {:width 7 :height 4.2
                                      :backgroundColor "#0052A5"}}))))

(defn yoyo-type []
  (dom/div nil "\\YOYO"))

(defn yoyo-logo []
  (let [wrap-style (clj->js {:style {:fontFamily "hind" :backgroundColor "white"
                                     :display "flex" :justifyContent "center"
                                     :alignItems "center" :lineHeight 0
                                     :letterSpacing "1.2px" :fontSize 13
                                     :width 250 :height 140}})]
    (dom/div wrap-style
             (yoyo-flag)
             (yoyo-type))))

(defn root []
  (dom/div (clj->js {:style {:backgroundColor "rgba(233, 237, 239, 0.42)"
                             :display "flex"
                             :flex 1
                             :justifyContent "center"
                             :alignItems "center"}})
           (yoyo-logo)))

(js/React.render (root) (gdom/getElement "app"))
