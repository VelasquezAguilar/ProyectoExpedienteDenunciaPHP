

<?php

class Projects {
    public $project_id;
    public $name;
    public $description;
    public $created_at;
    public $status;

    public function getProject_id() {
        return $this->project_id;
    }

    public function getName() {
        return $this->name;
    }

    public function getDescription() {
        return $this->description;
    }

    public function getCreated_at() {
        return $this->created_at;
    }

    public function isStatus() {
        return $this->status;
    }
}

?>
