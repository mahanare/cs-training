SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `office` ;
CREATE SCHEMA IF NOT EXISTS `office` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `office` ;

-- -----------------------------------------------------
-- Table `department`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `department` ;

CREATE  TABLE IF NOT EXISTS `department` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) ,
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `designation`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `designation` ;

CREATE  TABLE IF NOT EXISTS `designation` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `title` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) ,
  UNIQUE INDEX `title_UNIQUE` (`title` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employee`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `employee` ;

CREATE  TABLE IF NOT EXISTS `employee` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `user_name` VARCHAR(45) NULL ,
  `password` VARCHAR(45) NULL ,
  `first_name` VARCHAR(45) NULL ,
  `last_name` VARCHAR(45) NULL ,
  `birth_date` DATE NULL ,
  `email_id` VARCHAR(200) NULL ,
  `manager_id` INT NULL ,
  `designation_id` INT NULL ,
  `department_id` INT NULL ,
  PRIMARY KEY (`id`) ,
  UNIQUE INDEX `user_name_UNIQUE` (`user_name` ASC) ,
  INDEX `fk_employee_designation_id` (`designation_id` ASC) ,
  INDEX `fk_employee_manager_id` (`manager_id` ASC) ,
  INDEX `fk_employee_department_id` (`department_id` ASC) ,
  CONSTRAINT `fk_employee_designation_id`
    FOREIGN KEY (`designation_id` )
    REFERENCES `designation` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_employee_manager_id`
    FOREIGN KEY (`manager_id` )
    REFERENCES `employee` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_employee_department_id`
    FOREIGN KEY (`department_id` )
    REFERENCES `department` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `office` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `department`
-- -----------------------------------------------------
START TRANSACTION;
USE `office`;
INSERT INTO `department` (`id`, `name`) VALUES (1, 'Development');
INSERT INTO `department` (`id`, `name`) VALUES (2, 'Quality');
INSERT INTO `department` (`id`, `name`) VALUES (3, 'HR');
INSERT INTO `department` (`id`, `name`) VALUES (4, 'Finance');

COMMIT;

-- -----------------------------------------------------
-- Data for table `designation`
-- -----------------------------------------------------
START TRANSACTION;
USE `office`;
INSERT INTO `designation` (`id`, `title`) VALUES (1, 'Developer');
INSERT INTO `designation` (`id`, `title`) VALUES (2, 'Dev Lead');
INSERT INTO `designation` (`id`, `title`) VALUES (3, 'QA Engineer');
INSERT INTO `designation` (`id`, `title`) VALUES (4, 'QA Lead');
INSERT INTO `designation` (`id`, `title`) VALUES (5, 'Manager');

COMMIT;

-- -----------------------------------------------------
-- Data for table `employee`
-- -----------------------------------------------------
START TRANSACTION;
USE `office`;
INSERT INTO `employee` (`id`, `user_name`, `password`, `first_name`, `last_name`, `birth_date`, `email_id`, `manager_id`, `designation_id`, `department_id`) VALUES (1, 'hari', 'test1', 'Harinath', 'Mallepally', '1980-02-23', NULL, NULL, 5, NULL);
INSERT INTO `employee` (`id`, `user_name`, `password`, `first_name`, `last_name`, `birth_date`, `email_id`, `manager_id`, `designation_id`, `department_id`) VALUES (2, 'Jatin', 'test1', 'Jatin', 'abc', '1990-02-20', NULL, 1, 1, NULL);

COMMIT;
